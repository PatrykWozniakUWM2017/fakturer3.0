package eu.programisci.app.kontrahent.service;

import eu.programisci.app.kontrahent.converters.KontrahentCoverter;
import eu.programisci.app.kontrahent.dto.KontrahentDTO;
//import eu.programisci.Test.user.dto.UserForTableDTO;
import eu.programisci.app.kontrahent.ob.KontrahentOB;
import eu.programisci.app.kontrahent.repository.IKontrahentRepository;
import eu.programisci.app.kontrahent.service.IKontrahentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KontrahentServiceImpl implements IKontrahentService {

    @Autowired
    private IKontrahentRepository kontrahentRepository;

    @Autowired
    private KontrahentCoverter kontrahentCoverter;

    @Override
    public KontrahentDTO findOne(Long id) {
        KontrahentOB ob = kontrahentRepository.findOne(id);
        KontrahentDTO dto = kontrahentCoverter.obToDto(ob);
        return dto;
    }

    @Override
    public List<KontrahentDTO> findAllForTable() {
        List<KontrahentOB> obList = kontrahentRepository.findAll();
        List<KontrahentDTO> dtoList = kontrahentCoverter.kontrahentObToKontrahentForTable(obList);
        return dtoList;
    }

    @Override
    public void deleteOne(Long id) {
        kontrahentRepository.delete(id);
    }

    @Override
    public KontrahentDTO save(KontrahentDTO dto) {
        if (dto.getId() == null) {
            return kontrahentCoverter.obToDto(create(dto));
        } else {
            return kontrahentCoverter.obToDto(update(dto));
        }
    }

    private KontrahentOB create(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentCoverter.dtoToOb(dto);
        ob.setCreationDate(new Date());
        ob = kontrahentRepository.save(ob);
        return ob;
    }

    private KontrahentOB update(KontrahentDTO dto) {
        KontrahentOB ob = kontrahentRepository.findOne(dto.getId());
        ob.setNazwa(dto.getNazwa());
        ob.setAdres(dto.getAdres());
        ob.setNip(dto.getNip());
        ob = kontrahentRepository.save(ob);
        return ob;
    }
}

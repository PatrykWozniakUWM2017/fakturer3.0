package eu.programisci.app.kontrahent.converters;

import eu.programisci.app.kontrahent.dto.KontrahentDTO;
//import eu.programisci.Test.user.dto.KontrahentForTableDTO;
import eu.programisci.app.kontrahent.ob.KontrahentOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KontrahentCoverter {

    public KontrahentDTO obToDto(KontrahentOB in) {
        KontrahentDTO out = new KontrahentDTO();
        out.setId(in.getId());
        // out.setCreationDate(in.getCreationDate());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }

    public KontrahentOB dtoToOb(KontrahentDTO in) {
        KontrahentOB out = new KontrahentOB();
        out.setId(in.getId());
        //out.setCreationDate(in.getCreationDate());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }


    public List<KontrahentDTO> kontrahentObToKontrahentForTable(List<KontrahentOB> inList) {
        if (inList == null) {
            return null;
        }
        List<KontrahentDTO> outList = new ArrayList<>();
        for (KontrahentOB in : inList) {
            outList.add(kontrahentObToKontrahentForTable(in));
        }
        return outList;
    }


    private KontrahentDTO kontrahentObToKontrahentForTable(KontrahentOB in) {
        KontrahentDTO out = new KontrahentDTO();
        out.setId(in.getId());
        //out.setCreationDate(in.getCreationDate());
        out.setNazwa(in.getNazwa());
        out.setAdres(in.getAdres());
        out.setNip(in.getNip());
        return out;
    }
}
package eu.programisci.app.kontrahent.service;

import eu.programisci.app.kontrahent.dto.KontrahentDTO;
//import eu.programisci.Test.user.dto.UserForTableDTO;

import java.util.List;

public interface IKontrahentService {

    KontrahentDTO findOne(Long id);

    List<KontrahentDTO> findAllForTable();

    void deleteOne(Long id);

    KontrahentDTO save(KontrahentDTO kontrahentDTO);
}

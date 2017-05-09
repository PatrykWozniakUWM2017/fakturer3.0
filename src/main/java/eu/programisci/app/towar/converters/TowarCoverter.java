package eu.programisci.app.towar.converters;

import eu.programisci.app.towar.dto.TowarDTO;
//import eu.programisci.Test.user.dto.UserForTableDTO;
import eu.programisci.app.towar.ob.TowarOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TowarCoverter {

    public TowarDTO obToDto(TowarOB in) {
        TowarDTO out = new TowarDTO();
        out.setId(in.getId());
        //out.setCreationDate(in.getCreationDate());
        out.setNazwa(in.getNazwa());
        out.setPkwiu(in.getPkwiu());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setVat(in.getVat());
        out.setCenaNetto(in.getCenaNetto());
        return out;
    }

    public TowarOB dtoToOb(TowarDTO in) {
        TowarOB out = new TowarOB();
        out.setId(in.getId());
        //out.setCreationDate(in.getCreationDate());
        out.setNazwa(in.getNazwa());
        out.setPkwiu(in.getPkwiu());
        out.setJednostkaMiary(in.getJednostkaMiary());
        out.setVat(in.getVat());
        out.setCenaNetto(in.getCenaNetto());
        return out;
    }
}

/*
    public List<UserForTableDTO> userObToUserForTable(List<UserOB> inList) {
        if (inList == null) {
            return null;
        }
        List<UserForTableDTO> outList = new ArrayList<>();
        for (UserOB in : inList) {
            outList.add(userObToUserForTable(in));
        }
        return outList;
    }

    private UserForTableDTO userObToUserForTable(UserOB in) {
        UserForTableDTO out = new UserForTableDTO();
        out.setId(in.getId());
        out.setCreationDate(in.getCreationDate());
        out.setLogin(in.getLogin());
        out.setName(in.getName());
        out.setLastname(in.getLastname());
        return out;
    }
}
*/
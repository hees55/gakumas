package net.gakumas.skill;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillMapper skillMapper;

    /*
    public List<Skill> getSkillList(){
        return (List<Skill>) skillMapper
    }
     */
    public List<Skill> getSkillList(){
        return skillMapper.findAllSkills();
    }

    public SkillDto getSkillById(Long id){
        return skillMapper.getSkillInfo(id);
    }
}

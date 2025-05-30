package net.gakumas.skill;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface SkillMapper {
    //public SkillDto getSkillInfo(@Param("Id") String)
    @Select("SELECT * FROM skill WHERE id = #{id}")
    SkillDto getSkillInfo(@Param("id") Long id);

    @Select("SELECT * FROM skill")
    List<Skill> findAllSkills();
}

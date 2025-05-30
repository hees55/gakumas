package net.gakumas.skill;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SkillDto {
    @Schema(name = "id", description = "스킬id")
    private Long id;
    @Schema(name = "type", description = "액티브or멘탈")
    private int type;
    @Schema(name = "ptype", description = "free,sense,etc")
    private int ptype;
    @Schema(name = "nameKr", description = "한국어이름")
    private String nameKr;
    @Schema(name = "nameJp", description = "원문이름")
    private String nameJp;
    @Schema(name = "Rarity", description = "N,R,SR,SSR")
    private int rarity;

    //public Skill toEntity() {return new Skill(id,type,ptype,nameKr,nameJp,rarity);}
    public Skill toEntity(){
        return Skill.builder()
                .skillId(id)
                .skillType(type)
                .skillPType(ptype)
                .NameKR(nameKr)
                .NameJP(nameJp)
                .Rarity(rarity)
                .build();
    }
}

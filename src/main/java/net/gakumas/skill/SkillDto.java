package net.gakumas.skill;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SkillDto {
    private Long id;
    private int type;
    private int ptype;
    private String namekr;
    private String namejp;
    private int rarity;

    public Skill toEntity() {return new Skill(id,type,ptype,namekr,namejp,rarity);}
}

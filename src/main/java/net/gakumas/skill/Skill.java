package net.gakumas.skill;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Skill {
    @Schema(description="skillid")
    Long skillId;

    @Schema(description = "type 0=active, 1=mental")
    int skillType;

    @Schema(description = "ptype 0=free,")
    int skillPType;

    @Schema(description = "name in Korean")
    String NameKR;

    @Schema(description = "name in Japanese")
    String NameJP;

    @Schema(description = "rarity 0=normal,")
    int Rarity;
}

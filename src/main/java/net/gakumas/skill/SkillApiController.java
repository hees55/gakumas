package net.gakumas.skill;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@AllArgsConstructor
@RequiredArgsConstructor
@RestController
@Tag(name = "Skills")
@RequestMapping(value = {"/skills"})
public class SkillApiController {
    private final SkillService skillService;

    @GetMapping("/{id}")
    @Operation(summary = "스킬 상세", description = "스킬 상세정보 조회")
    public SkillDto getSkillById(@PathVariable Long id){
        return skillService.getSkillById(id);
    }
}

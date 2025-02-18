package fr.unilorraine.idmc.gamescatalog.game;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
// https://www.freecodecamp.org/news/rest-api-best-practices-rest-endpoint-design-examples/
@RequestMapping("games")
@RequiredArgsConstructor
public class GamesController {
    private final GamesService gamesService;

    @GetMapping
    public List<GameView> findAll() {
        return gamesService.findAll();
    }

    @PostMapping
    public GameView create(@RequestBody NewGame newGame) {
        return gamesService.create(newGame);
    }
}

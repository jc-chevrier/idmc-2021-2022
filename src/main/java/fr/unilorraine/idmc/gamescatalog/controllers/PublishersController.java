package fr.unilorraine.idmc.gamescatalog.controllers;

import fr.unilorraine.idmc.gamescatalog.dto.NewPublisher;
import fr.unilorraine.idmc.gamescatalog.dto.PublisherView;
import fr.unilorraine.idmc.gamescatalog.entities.Publisher;
import fr.unilorraine.idmc.gamescatalog.services.PublishersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// https://www.freecodecamp.org/news/rest-api-best-practices-rest-endpoint-design-examples/
@RequestMapping("publishers")
@RequiredArgsConstructor
public class PublishersController {
    private final PublishersService service;

    @GetMapping
    public List<PublisherView> findAll() {
        return service.findAll();
    }

    @PostMapping
    public PublisherView create(@RequestBody NewPublisher newPublisher) {
        return service.create(newPublisher);
    }
}

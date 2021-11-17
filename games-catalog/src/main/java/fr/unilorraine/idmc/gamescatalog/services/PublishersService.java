package fr.unilorraine.idmc.gamescatalog.services;

import fr.unilorraine.idmc.gamescatalog.dto.NewPublisher;
import fr.unilorraine.idmc.gamescatalog.dto.PublisherView;
import fr.unilorraine.idmc.gamescatalog.entities.Publisher;
import fr.unilorraine.idmc.gamescatalog.mappers.PublisherMapper;
import fr.unilorraine.idmc.gamescatalog.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PublishersService {
    private final PublisherRepository repo;
    private final PublisherMapper mapper;

    public List<PublisherView> findAll() {
        return mapper.toDto(repo.findAll());
    }

    public PublisherView create(NewPublisher np) {
        return mapper.toDto(repo.save(mapper.toEntity(np)));
    }
}

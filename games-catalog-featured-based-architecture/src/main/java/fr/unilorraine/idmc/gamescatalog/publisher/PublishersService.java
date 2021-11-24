package fr.unilorraine.idmc.gamescatalog.publisher;

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

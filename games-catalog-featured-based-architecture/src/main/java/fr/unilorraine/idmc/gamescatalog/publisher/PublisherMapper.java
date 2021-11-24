package fr.unilorraine.idmc.gamescatalog.publisher;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;
import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PublisherMapper {
    default List<PublisherView> toDto(Page<Publisher> page) {
        return page
                .map(this::toDto)
                .getContent();
    }

    PublisherView toDto(Publisher publisher);

    default List<PublisherView> toDto(Iterable<Publisher> publishers) {
        var publishersViews = new ArrayList<PublisherView>();
        publishers.forEach(publisher -> publishersViews.add(toDto(publisher)));
        return publishersViews;
    }

    @Mapping(target = "id", ignore = true)
    Publisher toEntity(NewPublisher newPublisher);
}

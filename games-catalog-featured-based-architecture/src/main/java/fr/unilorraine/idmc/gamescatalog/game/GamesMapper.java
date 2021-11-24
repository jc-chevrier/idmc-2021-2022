package fr.unilorraine.idmc.gamescatalog.game;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

//https://www.baeldung.com/mapstruct#1-modify-the-mapper
@Mapper(componentModel = "spring")
public interface GamesMapper {
    default List<GameView> toDto(Page<Game> page) {
        return page
                .map(this::toDto)
                .getContent();
    }

//    https://www.baeldung.com/mapstruct-custom-mapper#custom-mapper-annotation
    @Mapping(source = "publisher.id", target = "publisherId")
    @Mapping(source = "publisher.name", target = "publisherName")
    GameView toDto(Game gg);

    default List<GameView> toDto(Iterable<Game> games) {
        var gamesViews = new ArrayList<GameView>();
        games.forEach(game -> gamesViews.add(toDto(game)));
        return gamesViews;
    }

//    https://www.baeldung.com/mapstruct-ignore-unmapped-properties#ignore-specific-fields
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "publisher", ignore = true)
    Game toEntity(NewGame dto);
}

package com.zhp.french.mapper;

import com.zhp.french.domain.Quest;
import com.zhp.french.domain.QuestDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-12-05T14:55:40+0100",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_271 (Oracle Corporation)"
)
@Component
public class QuestMapperImpl implements QuestMapper {

    @Override
    public List<QuestDto> mapToQuestDtoList(List<Quest> all) {
        if ( all == null ) {
            return null;
        }

        List<QuestDto> list = new ArrayList<QuestDto>( all.size() );
        for ( Quest quest : all ) {
            list.add( mapToQuestDto( quest ) );
        }

        return list;
    }

    @Override
    public QuestDto mapToQuestDto(Quest fetched) {
        if ( fetched == null ) {
            return null;
        }

        QuestDto questDto = new QuestDto();

        return questDto;
    }

    @Override
    public Quest mapToQuest(QuestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Quest quest = new Quest();

        return quest;
    }
}

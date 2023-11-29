package com.example.board.mappers;

import com.example.board.dto.BoardDto;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface BoardMapper {

    @Select("SELECT ifnull( max(grp) + 1, 1 ) AS maxGrp FROM board")
    int getMaxGrp();

    @Insert("INSERT INTO board VALUES(null, " +
            "#{subject}, #{writer}, #{content}, 0, now(), " +
            "#{orgName}, #{savedFileName}, #{savedFilePathName}, #{savedFileSize}, " +
            "#{folderName}, #{ext}, #{grp}, 1, 1)")
    void setWrite(BoardDto boardDto);

    @Insert("INSERT INTO board VALUES(null, " +
            "#{subject}, #{writer}, #{content}, 0, now(), " +
            "#{orgName}, #{savedFileName}, #{savedFilePathName}, #{savedFileSize}, " +
            "#{folderName}, #{ext}, #{grp}, #{seq}, #{depth})")
    void setReply(BoardDto boardDto);


    @Select("SELECT * FROM board ${searchQuery} ORDER BY grp desc, seq asc")
    List<BoardDto> getList(Map<String, Object> map);

    @Select("SELECT COUNT(*) FROM board")
    int getListCount(Map<String, Object> map);

    @Select("SELECT * FROM board WHERE id = #{id}")
    BoardDto getView(int id);

    @Update("UPDATE board SET visit = visit + 1 WHERE id = #{id}")
    void updateVisit(int id);

    @Delete("delete from board where id = #{id}")
    void setDelete(int id);


}








package com.example.member.mappers;

import com.example.member.dto.MemberDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Insert("insert into member values(null, #{userid}, #{passwd}, #{username}, now());")
    void setInsert(MemberDto memberDto);

    @Select("select * from member ${queryString} order by id desc;")
    List<MemberDto> getMemberList(String queryString);

    @Select("select count(*) from member ${queryString}")
    int getMemberCount(String queryString);

    @Delete("delete from member where id = #{id}")
    void deleteMember(int id);
}

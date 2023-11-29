package com.example.board.service;

import com.example.board.dto.BoardDto;
import com.example.board.mappers.BoardMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    //검색 메소드
    public List<BoardDto> getSearch(String searchType, String words){
        Map<String, Object> map = new HashMap<>();

        String searchQuery = "";

        //searchType
        //where subject = '코리아아이티 게시판'
        //where writer = '관리자'
        if(searchType.equals("subject")|| searchType.equals("writer")){
            searchQuery = "where" + searchType + " = '" + words+ "'";
        }else if(searchType.equals("content")){
            searchQuery = "where" + searchType + "like '%"+words+"%'";
        }else{
            searchQuery = "";
        }

        map.put("searchQuery", searchQuery);



    return boardMapper.getList(map);

    }

    public int getSearchCnt(String searchType, String words){
        Map<String, Object> map = new HashMap<>();

        String searchQuery = "";

        //searchType
        //where subject = '코리아아이티 게시판'
        //where writer = '관리자'
        if(searchType.equals("subject") || searchType.equals("writer")){
            searchQuery = "where" + searchType + " = '" + words+ "'";
        }else if(searchType.equals("content")){
            searchQuery = "where" + searchType + "like '%"+words+"%'";
        }else{
            searchQuery = "";
        }

        map.put("searchQuery", searchQuery);
        return boardMapper.getListCount(map);

    }

    public void setDelete(int id) {

        if(id > 0 ){
            //db


            //file
            BoardDto bd = boardMapper.getView(id);
            boardMapper.setDelete(id);
            System.out.println(bd.getFolderName());
            System.out.println(bd.getSavedFileName());

//            String removeFile = bd.getSavedFilePathName(); //c 절대경로 + 파일이름
            String removeFile = "src/main/resources/static/upload/" + bd.getFolderName() + "/" + bd.getSavedFileName(); //상대경로

            System.out.println(removeFile);

            //File 객체는 생성또는 삭제할 준비
            File f = new File(removeFile);

            if( f.exists()){
                boolean result = f.delete();

                if(result){
                    System.out.println("파일이 삭제되었습니다.");
                }else{
                    System.out.println("파일이 존재하지 않습니다.");
                }
            }


        }
    }

}

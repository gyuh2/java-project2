package com.example.javaproject2.week4.day4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    public List<String> getLines(String fileName) {
        // List 인터페이스
        List<String> lines = new LinkedList<>();

        try(BufferedReader br = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                // 전체 라인 불러오(null이 아닐 때까지)
                // System.out.println(line);
                lines.add(line);
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

    public static void main(String[] args) throws IOException {
        // Console에서 읽어오기
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // File에서 읽어오기
        ReadFileEx rfe =new ReadFileEx();
        List<String> result = rfe.getLines("/Users/im_gyuh2/hospital_info_0920_utf8.csv");
        System.out.println(result.get(0));
    }
}

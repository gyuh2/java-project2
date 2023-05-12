package com.example.javaproject2.week4.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FileReaderEx {
    Charset charset;

    public FileReaderEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        // BufferedReader 선언: file 연결
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        // BufferedReader에서 loop으로 한 줄씩 불러오기
        String line;
        while ((line = br.readLine()) != null) {
            // 전체 라인 불러오(null이 아닐 때까지)
            // System.out.println(line);
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
        //System.out.println(str);
        String[] splitted = str.split(",");
        //System.out.println(splitted[1]);
        // System.out.println(Arrays.toString(splitted));
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line: lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        FileReaderEx fre = new FileReaderEx(Charset.forName("UTF-8"));
        List<String> strLines = fre.getLines("hospital_info_10lines.csv");
        List<Hospital> parsedHospital = fre.getHospitals(strLines);
        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(), hospital.getAddress().getFullAddr());
        }
    }

}

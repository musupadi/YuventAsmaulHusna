package com.example.asmaulhusna.Model;

import java.util.ArrayList;

public class DataModelAsmaulHusna {
    public static String[][] data = new String[][]{
            {"1",
                    "Ar-Rahman",
                    "Yang Maha Pemurah",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSfYVUFN65N-EhKCcSuLeBFgu7D4Aksqn2PkxNGDdPG742A_ndQ",
                    "suara",
                    "kisah",
                    "kisahGambar",
                    "penjelasan",
                    "judulkisah"
            },
            {"2",
                    "Ar-Rahim",
                    "Yang Maha Pengasih",
                    "kosong",
                    "suara",
                    "kisah",
                    "kisahGambar",
                    "penjelasan",
                    "judulkisah"
                    }
    };
    public static ArrayList<ModelAsmaulHusna> getListData(){
        ModelAsmaulHusna asmaulHusna = null;
        ArrayList<ModelAsmaulHusna> list = new ArrayList<>();
        for (String[] aData : data) {
            asmaulHusna = new ModelAsmaulHusna();
            asmaulHusna.setNomor(aData[0]);
            asmaulHusna.setNama(aData[1]);
            asmaulHusna.setArti(aData[2]);
            asmaulHusna.setGambar(aData[3]);
            asmaulHusna.setSuara(aData[4]);
            asmaulHusna.setKisah(aData[5]);
            asmaulHusna.setKisahGambar(aData[6]);
            asmaulHusna.setPenjelasan(aData[7]);
            asmaulHusna.setJudulkisah(aData[8]);
            list.add(asmaulHusna);
        }
        return list;
    }
}

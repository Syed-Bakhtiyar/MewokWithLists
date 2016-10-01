package com.example.syedinkisarahmed.mewwork;

/**
 * Created by Syed Inkisar Ahmed on 9/29/2016.
 */
public class Word {
    private String defaultEnglishWord;
    private String miwokTranslationApp;

    public Word(String defaultEnglishWord, String miwokTranslationApp) {
        this.defaultEnglishWord = defaultEnglishWord;
        this.miwokTranslationApp=miwokTranslationApp;
    }


    public String getMiwokTranslationApp() {
        return miwokTranslationApp;
    }

    public String getDefaultEnglishWord() {
        return defaultEnglishWord;
    }
}

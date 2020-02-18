package com.example.android.myapplication;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourseId;
    private int mSoundResourseId;
    private boolean hasImage;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mSoundResourseId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mSoundResourseId = mSoundResourseId;
        hasImage = false;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mSoundResourseId, int mImageResourseId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourseId = mImageResourseId;
        this.mSoundResourseId = mSoundResourseId;
        hasImage = true;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getmImageResourseId() {
        return mImageResourseId;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public int getmSoundResourseId() {
        return mSoundResourseId;
    }

    public void setmSoundResourseId(int mSoundResourseId) {
        this.mSoundResourseId = mSoundResourseId;
    }
}
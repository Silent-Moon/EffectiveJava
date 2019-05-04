package ch4.item20;

public interface SingerSongWriter extends Singer, SongWriter {
    AudioClip strum();

    void actSensitive();
}

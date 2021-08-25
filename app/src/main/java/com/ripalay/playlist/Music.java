package com.ripalay.playlist;

public class Music {
    private String nameMusic;
    private String executorMusic;
    private int numberMusic;
    private String timeMusic;

    public Music(String nameMusic, String executorMusic, Integer numberMusic, String timeMusic) {
        this.nameMusic = nameMusic;
        this.executorMusic = executorMusic;
        this.numberMusic = numberMusic;
        this.timeMusic = timeMusic;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public String getExecutorMusic() {
        return executorMusic;
    }

    public Integer getNumberMusic() {
        return numberMusic;
    }

    public String getTimeMusic() {
        return timeMusic;
    }
}

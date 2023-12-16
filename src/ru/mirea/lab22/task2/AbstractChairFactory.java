package ru.mirea.lab22.task2;
public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();
    public MagicChair createMagicanChair();
    public FunctionalChair createFanctionalChair();
}
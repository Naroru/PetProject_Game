package org.OlegChukhlantsev;

import org.OlegChukhlantsev.Characters.InteractionManager;
import org.OlegChukhlantsev.Frames.Game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {



    /*    try {
            File soundFile = new File("C:\\Users\\Oleg\\Desktop\\Sound.wav"); //Звуковой файл

            //Получаем AudioInputStream
            //Вот тут могут полететь IOException и UnsupportedAudioFileException
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

            //Получаем реализацию интерфейса Clip
            //Может выкинуть LineUnavailableException
            Clip clip = AudioSystem.getClip();

            //Загружаем наш звуковой поток в Clip
            //Может выкинуть IOException и LineUnavailableException
            clip.open(ais);

            clip.setFramePosition(0); //устанавливаем указатель на старт
            clip.start(); //Поехали!!!

            //Если не запущено других потоков, то стоит подождать, пока клип не закончится
            //В GUI-приложениях следующие 3 строчки не понадобятся
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop(); //Останавливаем
            clip.close(); //Закрываем
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}
        ;
*/

/*

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class)) {

            InteractionManager person = context.getBean("interactionManager", InteractionManager.class);

            System.out.println(person.game.name);
        }
*/

        Game game = new Game();

        game.startGame();
    }


}
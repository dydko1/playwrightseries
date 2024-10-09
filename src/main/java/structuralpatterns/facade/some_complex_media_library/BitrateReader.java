package structuralpatterns.facade.some_complex_media_library;

import structuralpatterns.facade.some_complex_media_library.Codec;
import structuralpatterns.facade.some_complex_media_library.VideoFile;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
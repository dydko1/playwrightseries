package structuralpatterns.facade.some_complex_media_library;

import structuralpatterns.facade.some_complex_media_library.Codec;
import structuralpatterns.facade.some_complex_media_library.MPEG4CompressionCodec;
import structuralpatterns.facade.some_complex_media_library.OggCompressionCodec;
import structuralpatterns.facade.some_complex_media_library.VideoFile;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
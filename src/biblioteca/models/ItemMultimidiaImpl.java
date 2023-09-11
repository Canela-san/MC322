package biblioteca.models;

import java.lang.constant.ClassDesc;

enum FormatoMultimídia {
    AUDIO, VIDEO, SOFTWARE
}

public class ItemMultimidiaImpl implements ItemMultimidia {
    @Override
    public String getTitulo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDetalhes() {
        // TODO Auto-generated method stub
        return null;
    }

    public class AudioImpl implements Audio {

    }

    public class VideoImpl implements Video {

    }

    public class SoftwareImpl implements Software {

    }
}

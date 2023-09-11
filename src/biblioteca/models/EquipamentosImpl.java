package biblioteca.models;

enum CategoriaEquipamento {
    INFORMATICA, AUDIOVISUAL, IMPRESSÃO
}

public class EquipamentosImpl implements Equipamentos {
    public class InformaticaImpl extends EquipamentosImpl implements Informatica {
    }

    public class AudiovisualImpl extends EquipamentosImpl implements Audiovisual {
    }

    public class ImpressãoImpl extends EquipamentosImpl implements Impressão {
    }
}

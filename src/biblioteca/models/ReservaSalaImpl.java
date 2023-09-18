package biblioteca.models;

import java.util.ArrayList;
import java.util.List;

import biblioteca.controllers.ReservaControleImpl;

enum StatusReserva {
    PENDENTE, CONFIRMADA, CANCELADA
}

public class ReservaSalaImpl implements ReservaSala {
    
    public class SalaIndividualImpl implements SalaIndividual {
    }

    public class SalaGrupoImpl implements SalaGrupo {
    }

    public class SalaSilenciosaImpl implements SalaSilenciosa {
    }

    public class SalaMultimidiaImpl implements SalaMultimidia {
    }
}

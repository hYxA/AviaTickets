package ru.netologt.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;
import java.util.Arrays;
import java.util.Objects;
import static java.lang.System.arraycopy;

public class TicketManager {
    private TicketRepository repository = new TicketRepository();
    private Ticket[] items = new Ticket[0];

    public void save(Ticket item) {
        repository.save(item);
    }

    public Ticket[] searchBy(String to, String from) {
        Ticket[] massiveResult = new Ticket[0];

        for (Ticket item : items) {
            if ((Objects.equals(item.getDepartureAirport(), from)
                    || Objects.equals(item.getArrivalAirport(), to)) {
                int length = massiveResult.length + 1;
                Ticket[] tmp = new Ticket[length];
                arraycopy(items, 0, tmp, 0, items.length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = item;
                massiveResult = tmp;
            }
            Arrays.sort(massiveResult);
        }
        return massiveResult;
    }

    public void removeById(int id) {
        repository.removeById(id);
    }
}

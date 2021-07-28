package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {
    private Ticket[] items = new Ticket[0];

    public void save(Ticket item) {
        int length = items.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Ticket[] findAll() {
        return items;
    }

    public Ticket removeById(int idToRemove) {
        if (idToRemove > items.length) {
            System.out.println("Не существует объекта с таким ID");
            System.out.println("------------------");
            return null;
        }
        int index = 0;
        int length = items.length - 1;
        Ticket[] result = new Ticket[length];
        for (Ticket item : items) {
            if (item.getId() != idToRemove) {
                result[index] = item;
                index++;
            }
        }
        return null;
    }
}

package de.petermeissner.learnjeerest.app;

import lombok.Data;

@Data
public class Counter {
        public int count;

        Counter() {
            count = 0;
        }
}

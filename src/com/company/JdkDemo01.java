package com.company;

import java.util.*;

public class JdkDemo01 {
    Map map = new HashMap();
    Set set = new TreeSet<>();

    private static void createSetCollection() {
//        Set set=new TreeSet((s1,s2)->{
//
//        });
        Arrays.asList("jack", "mark", "facker", "marin").
                forEach(s -> {
                    Map m = new HashMap();
                    m.put(s, 30);

                });
    }

    class animal {
        private String name;
        private Long liveDate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getLiveDate() {
            return liveDate;
        }

        public void setLiveDate(Long liveDate) {
            this.liveDate = liveDate;
        }

        @Override
        public String toString() {
            return "animal{" +
                    "name='" + name + '\'' +
                    ", liveDate=" + liveDate +
                    '}';
        }
    }
}

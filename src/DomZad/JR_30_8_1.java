package DomZad;
import java.util.List;

/*
Анонимность иногда так приятна!
*/

public class JR_30_8_1 {
    public static void main(String[] args) {
        JR_30_8_1 solution = new JR_30_8_1();
        print(solution.getUsers());
        print(solution.getLocations());
        print(solution.getServers());
        print(solution.getSubjects());
        print(solution.getSubscriptions());
    }

    public static void print(List list) {
        String format = "Id=%d, name='%s', description=%s";
        for (Object obj : list) {
            NamedItem item = (NamedItem) obj;
            System.out.println(String.format(format, item.getId(), item.getName(), item.getDescription()));
        }
    }

    public List<User01> getUsers() {
        return new AbstractDbSelectExecutor<User01>() {
            @Override
            public String getQuery() {
                return ("select * from " + "User").toUpperCase();
            }
        }.execute();
    }


    public List<Location> getLocations() {
        return new AbstractDbSelectExecutor<Location>() {
            @Override
            public String getQuery() {
                return ("select * from " + "Location").toUpperCase();
            }
        }.execute();
    }

    public List<Server> getServers() {
        return new AbstractDbSelectExecutor<Server>() {
            @Override
            public String getQuery() {
                return ("select * from " + "Server").toUpperCase();
            }
        }.execute();
    }

    public List<Subject> getSubjects() {
        return new AbstractDbSelectExecutor<Subject>() {
            @Override
            public String getQuery() {
                return ("select * from " + "Subject").toUpperCase();
            }
        }.execute();
    }

    public List<Subscription> getSubscriptions() {
        return new AbstractDbSelectExecutor<Subscription>() {
            @Override
            public String getQuery() {
                return ("select * from " + "Subscription").toUpperCase();
            }
        }.execute();
    }
}
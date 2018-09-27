import java.util.ArrayList;

public class Network {
    public class Member { // Member is an inner class of Network
        private String name;
        private ArrayList<Member> friends;

        public Member(String name) {
            this.name = name;
            friends = new ArrayList<>();
        }
    }
    private ArrayList<Member> members;
}

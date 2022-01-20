 import java.util.List;

    public class Alex extends Lion {

        public Alex() throws Exception {
            super(new Feline(), "Самец");
        }

        @Override
        public int getKittens() {
            return 0;
        }

        public List<String> getFriends() {
            return List.of("Марти", "Мелман", "Глория");
        }

        public String getPlaceOfLiving() {
            return "Нью-Йоркский зоопарк";
        }

    }


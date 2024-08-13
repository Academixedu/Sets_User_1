public class Person{
    private int p_id;
        private String p_name;
        private int p_sal;
        
        public Person(int p_id, String p_name, int p_sal) {
            this.p_id = p_id;
            this.p_name = p_name;
            this.p_sal = p_sal;
            
        }
        public int getP_id() {
            return p_id;
        }
        public void setP_id(int p_id) {
            this.p_id = p_id;
        }
        public String getP_name() {
            return p_name;
        }
        public void setP_name(String p_name) {
            this.p_name = p_name;
        }
        public int getP_sal() {
            return p_sal;
        }
        public void setP_sal(int p_sal) {
            this.p_sal = p_sal;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + p_id;
            result = prime * result + ((p_name == null) ? 0 : p_name.hashCode());
            result = prime * result + p_sal;
            
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Person other = (Person) obj;
            if (p_id != other.p_id)
                return false;
            if (p_name == null) {
                if (other.p_name != null)
                    return false;
            } else if (!p_name.equals(other.p_name))
                return false;
            if (p_sal != other.p_sal)
                return false;
            
                
            return true;
        }
        
        
        
        
            
        
        @Override
        public String toString() {
            return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_sal=" + p_sal  + "]";
        }

    
    }
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it

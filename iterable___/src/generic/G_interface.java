package generic;

public interface G_interface<T> {
	    void processData(T data);
	}
	class StringProcessor implements G_interface<String> {
	    @Override
	    public void processData(String data) {
	        System.out.println("Processing String: " + data);
	    }
	}

	class IntegerProcessor implements G_interface<Integer> {
	    @Override
	    public void processData(Integer data) {
	        System.out.println("Processing Integer: " + data);
	    }
	}

	


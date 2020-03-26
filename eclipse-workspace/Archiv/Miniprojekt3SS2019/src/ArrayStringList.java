/**
 * An array list to store strings.
 * 
 * @author Marcus
 */
public class ArrayStringList implements StringList {

	/**
	 * The items in the list.
	 */
	private String[] items = new String[0];
	
	/**
	 * Creates a new empty list.
	 */
	public ArrayStringList() {
		super();
	}

	@Override
	public void appendString(String text) {
		if(items.length == 0) {
			items = new String [] {text}; 
		} else {
			String [] extendedItems = new String [items.length + 1];
			for(int i = 0; i<items.length; i++) {
				extendedItems[i] = items[i];
			}
			extendedItems[items.length] = text;
			items = extendedItems;
		}
	}

	@Override
	public String getStringAt(int i) {
		if(i < items.length && i > 0) {
			return items[i];
		}
		return null;
	}

	@Override
	public void insertStringAt(int i, String text) {
		if(i < items.length && i > 0) {
			String [] arrayList = new String [items.length + 1];
			arrayList[i] = items[i];
			for(int j = 0; j < i; j++) {
				arrayList[j] = items[j];
			}
			for(int y = i + 1; y < arrayList.length; y++) {
				arrayList[y] = items[y];
			}
			items = arrayList;
		}
	}

	@Override
	public void insertStringListAt(int i, StringList list) {
		
	}

	@Override
	public String replaceStringAt(int i, String text) {
		// TODO: implement
		return null;
	}
	
	@Override
	public String removeStringAt(int i) {
		// TODO: implement
		return null;
	}

	@Override
	public String getFirstString() {
		// TODO: implement
		return null;
	}

	@Override
	public String getLastString() {
		// TODO: implement
		return null;
	}

	@Override
	public StringList reverseStringList() {
		// TODO: implement
		return new ArrayStringList();
	}

	@Override
	public int getIndexOfString(String text, int from) {
		// TODO: implement
		return -1;
	}

	@Override
	public int countElements() {
		return 0;
	}

	@Override
	public String[] toStringArray() {
		return new String[0];
	}
	
	
}

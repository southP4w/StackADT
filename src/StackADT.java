@SuppressWarnings("unchecked")
public class ArrayStack<E> implements Stack<E>
{
	DynamicArray dynamicArray;

	public ArrayStack() {
		dynamicArray = new DynamicArray();
	}

	public ArrayStack(int size) {
		dynamicArray = new DynamicArray(size);
	}

	@Override
	public int size() {
		return dynamicArray.size;
	}

	@Override
	public boolean isEmpty() {
		return dynamicArray.isEmpty();
	}

	@Override
	public void push(E data) {
		dynamicArray.add(data);
	}

	@Override
	public E peek() {
		return (E) dynamicArray.look();
	}

	@Override
	public E pop() {
		if (isEmpty())
			return null;
		return (E) dynamicArray.remove();
	}

	public String toString() {
//		StringBuilder stringBuilder = new StringBuilder();
//		Object[] array = dynamicArray.array;
//		for (int i = dynamicArray.array.length - 1; i>=0; i--) {
//			Object o = array[i];
//			stringBuilder.append(o).append('\n');
//		}

		return dynamicArray.toString();
	}
}
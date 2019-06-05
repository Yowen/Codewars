public class SpinWords {

	public String spinWords(String sentence) {
		String[] array = sentence.split("[\\s]");
		StringBuilder spinnedSentence = new StringBuilder();
    
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() >= 5) {
				spinnedSentence.append(new StringBuilder(array[i]).reverse().toString());
			}
			else {
				spinnedSentence.append(array[i]);
			}
			if (i < array.length - 1) {
				spinnedSentence.append(" ");
			}
		}
		return spinnedSentence.toString();
	}
}

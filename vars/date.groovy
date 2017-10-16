import java.text.SimpleDateFormat
class date implements Serializable {
	private String currentDate

	def getCurrentDate(){
		setCurrentDate()
		currentDate
	}

	def setCurrentDate(){
		currentDate = new SimpleDateFormat("yyyyMMddHHmm").format(new Date())
	}
}

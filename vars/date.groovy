import java.text.SimpleDateFormat
def getCurrentDate(){
	def currentDate = new SimpleDateFormat("yyyyMMddHHmm").format(new Date())
}

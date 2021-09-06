# pip install pyttsx3
# pip install PYPDF2

import PyPDF2
import pyttsx3

path = open('The Pragmatic Programmer.pdf', 'rb')
# rb mode is read only in binary format
# creating a PdfFileReader object
pdfReader = PyPDF2.PdfFileReader(path)

# the page with which you want to start
# this will read the page of 25th page.
from_page = pdfReader.getNumPages()

pdftext = ""
for page in range(pdfReader.numPages):
    pageObj = pdfReader.getPage(page)
    pdftext += pageObj.extractText().replace('\n', '')

# extracting the text from the PDF
# text = from_page.extractText()


speak = pyttsx3.init()
speak.save_to_file(pdftext, 'pragmatic_full.mp3')
speak.runAndWait()

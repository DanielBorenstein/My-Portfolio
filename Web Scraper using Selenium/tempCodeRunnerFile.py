        CHROME_DRIVER_LOCATION = 'D:/driver/chromedriver'
        
        chrome_options = Options()
        chrome_options.add_argument('--no-sandbox')
        chrome_options.add_argument('--disable-dev-shm-usage') 
        self.driver = webdriver.Chrome(CHROME_DRIVER_LOCATION,chrome_options = chrome_options)
package com.simgle.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.ServletComponentScan

@ServletComponentScan(Constant.BASE_PACKAGE)
@SpringBootApplication(scanBasePackages = [Constant.BASE_PACKAGE])
open class SimgleApplication

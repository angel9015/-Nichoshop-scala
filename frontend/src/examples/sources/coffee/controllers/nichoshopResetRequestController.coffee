nichoshop
.controller('resetRequestController', ["$scope", "$http", "$location", "$timeout", "vcRecaptchaService", ($scope, $http, $location, $timeout, vcRecaptchaService) =>
  class RestorePassword
    data: {
      phone: ""
      email: ""
      makeACall: false
      sendSMS: false
    }
    recaptchaId: -1
    constructor: (@scope, @http) ->

    setRecaptchaId: (id) =>
      console.log("Got recaptchaId: #{id}")
      @recaptchaId = id


    restorePassword: () =>
      console.log(JSON.stringify(@data))
      dataToSend = {}

      if (@data.email != '')
        dataToSend.userid = @data.email
#      else
#        dataToSend.phone = @data.phone
#        if (@data.makeACall)
#          dataToSend.asSms = false
#        else
#          dataToSend.asSms = true
      dataToSend.grecaptcha = vcRecaptchaService.getResponse(@recaptchaId)

      @http.post("/api/user/restore", dataToSend).success((data, status, headers, config) =>
        toastr.success("Accepted")
        if (dataToSend.phone)
          $timeout(() =>
            window.location.replace("/phonecode.html")
          ,2000)

      ).error((data, status, headers, config) =>
        console.log(JSON.stringify(data))
        toastr.error(data.error)
      )

    $scope.restore = new RestorePassword($scope, $http)

])
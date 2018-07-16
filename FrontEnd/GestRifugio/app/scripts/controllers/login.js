'use strict';

/**
 * @ngdoc function
 * @name gestRifugioApp.controller:LoginCtrl
 * @description
 * # LoginCtrl
 * Controller of the gestRifugioApp
 */
angular.module('gestRifugioApp')
  .controller('LoginCtrl', function ($scope, $window, $http) {
    $scope.formSubmit = function () {
      var login = {
        username: $scope.login.username,
        password: $scope.login.password
      }
      $http.post('http://localhost:8080/login', login).then(function (response) {
        if (response.data === 1) {
          $window.location.href = '#/manage';
        } else {
          $scope.error = "Incorrect username/password !";
        }
      })
    }
  });

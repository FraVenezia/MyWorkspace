'use strict';

/**
 * @ngdoc function
 * @name helloworldApp.controller:FormExampleCtrl
 * @description
 * # FormExampleCtrl
 * Controller of the helloworldApp
 */
angular.module('helloworldApp')
  .controller('FormExampleCtrl', function ($scope, $http) {
    $scope.formexample = {}
    $scope.tab = []

    $scope.invioDati = function () {
      $scope.tab.push(angular.copy($scope.formexample));
      var dataObj = {
        nome: $scope.formexample.nome,
        cognome: $scope.formexample.cognome,
        email: $scope.formexample.email
      };
      $scope.clear();
      console.log(dataObj);
      $http.post('http://localhost:8080/users', dataObj).then(function (response) {
        console.log(response);
      });
    }

    $scope.clear = function () {
      $scope.formexample.nome = "";
      $scope.formexample.cognome = "";
      $scope.formexample.email = "";
    }

  });

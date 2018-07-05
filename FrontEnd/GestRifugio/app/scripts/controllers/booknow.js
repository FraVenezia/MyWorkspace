'use strict';

/**
 * @ngdoc function
 * @name gestRifugioApp.controller:BookNowCtrl
 * @description
 * # BookNowCtrl
 * Controller of the gestRifugioApp
 */
angular.module('gestRifugioApp')
  .controller('BookNowCtrl', function ($scope, $http) {
    $scope.bookform = {};
    $scope.book = [];

    $http.get('http://localhost:8080/room').then(function (response) {
      $scope.bookform.stanze = response.data;
      console.log(response);
    });

    $scope.invioDati = function () {
      $scope.book.push(angular.copy($scope.bookform))
      var userObj = {
        nome: $scope.bookform.nome,
        cognome: $scope.bookform.cognome,
        email: $scope.bookform.email
      };
      $http.post('http://localhost:8080/inuser', userObj).then(function (response) {
        console.log(response);
      });
      $scope.clear();
    }

    $scope.clear = function () {
      $scope.bookform.nome = "";
      $scope.bookform.cognome = "";
      $scope.bookform.email = "";
      $scope.bookform.stanza = "";
    }
  });

